function gray(encode, n) {
    if (encode) {
        // Binary to Gray
        return n ^ (n >>> 1);
    } else {
        // Gray to Binary
        let b = n;
        while (n) {
            n >>>= 1;
            b ^= n;
        }
        return b;
    }
}

// Display for 0-31
console.log("Decimal | Binary  | Gray    | Decoded");
for (let i = 0; i < 32; i++) {
    const g = gray(true, i);
    const decoded = gray(false, g);
    console.log(
        `${i.toString().padStart(7)} | ` +
        `${i.toString(2).padStart(7, '0')} | ` +
        `${g.toString(2).padStart(7, '0')} | ${decoded}`
    );
}
