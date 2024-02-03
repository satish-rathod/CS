function promiseSum(a, b) {
    function promiseSum(a, b) {
        return new Promise((resolve, reject) => {
            if (a > 0 && b > 0) {
                resolve(a + b);
            } else {
                reject("Both numbers must be positive");
            }
        });
    }
}
