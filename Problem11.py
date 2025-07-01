def Problem2():
    import sys
    chatlog = sys.stdin.readline().strip().lower()
    pattern = sys.stdin.readline().strip().lower()
    count = 0
    start_idxs = []
    for i in range(len(chatlog) - len(pattern) + 1):
        subPart = chatlog[i:i + len(pattern)]
        matched = True
        for j in range(len(pattern)):
            if pattern[j] != '?' and pattern[j] != subPart[j]:
                matched = False
                break
        if matched:
            count += 1
            start_idxs.append(i)

    print(count)
    if count > 0:
        print(" ".join(map(str, start_idxs)))
    else:
        print()
Problem2()