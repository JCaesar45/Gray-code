def gray(encode: bool, n: int) -> int:
    if encode:
        # Binary to Gray: n ^ (n >> 1)
        return n ^ (n >> 1)
    else:
        # Gray to Binary
        b = n
        while n:
            n >>= 1
            b ^= n
        return b


# Display for 0-31
print("Decimal | Binary  | Gray    | Decoded")
for i in range(32):
    g = gray(True, i)
    decoded = gray(False, g)
    print(f"{i:7} | {i:07b} | {g:07b} | {decoded}")
