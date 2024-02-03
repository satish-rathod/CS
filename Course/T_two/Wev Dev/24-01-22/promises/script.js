let a = 5;
let b = 6;

let promise = new Promise((resolve, reject) => {
    if (a == b) {
        resolve("Success");
    } else {
        reject("Failed");
    }
}
);

promise.then((message) => {
    console.log(message);
}
).catch((message) => {
    console.log(message);
}   
);