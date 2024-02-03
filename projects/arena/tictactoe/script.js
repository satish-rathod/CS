let board = ["", "", "", "", "", "", "", "", ""];

let currentPlayer = "X";

const cells = document.querySelectorAll(".cell");

cells.forEach((cell, index) => {
  cell.addEventListener("click", () => {
    makeMove(index);
  });
});

let gameActive = true;

function makeMove(index) {

    if (!gameActive) {
    return;
  }

  if (board[index] === "") {
    board[index] = currentPlayer;

    cells[index].textContent = currentPlayer;

    const winner = checkWin();
    if (winner) {
      const winnerMessage = document.getElementById("winner-message");
      winnerMessage.textContent = "Player " + winner + " wins!";
      winnerMessage.style.display = "block";

      gameActive = false;
    } else if (checkDraw()) {
      const drawMessage = document.getElementById("draw-message");
      drawMessage.style.display = "block";

      gameActive = false;
    } else {
      currentPlayer = currentPlayer === "X" ? "O" : "X";
    }
  }
}
function checkWin() {
    const winningCombinations = [
      [0, 1, 2], [3, 4, 5], [6, 7, 8],
      [0, 3, 6], [1, 4, 7], [2, 5, 8],
      [0, 4, 8], [2, 4, 6]
    ];
  
    for (let combination of winningCombinations) {
      const [a, b, c] = combination;
      if (board[a] !== "" && board[a] === board[b] && board[a] === board[c]) {
        return board[a];
      }
    }
  
    return null;
  }

function checkDraw() {
  return board.every(cell => cell !== "");
}

function resetGame() {
    
    board = ["", "", "", "", "", "", "", "", ""];
  
    cells.forEach((cell) => {
      cell.textContent = "";
    });
  
    const winnerMessage = document.getElementById("winner-message");
    winnerMessage.style.display = "none";
  
    const drawMessage = document.getElementById("draw-message");
    drawMessage.style.display = "none";
  
    gameActive = true;
  
    cells.forEach((cell) => {
      cell.removeEventListener("click", makeMove);
    });
  
    cells.forEach((cell, index) => {
      cell.addEventListener("click", () => makeMove(index));
    });
  }