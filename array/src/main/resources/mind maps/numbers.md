mind map
    reverse number's digits
        var reversedNum = 0;
        while (num > 0) {
            reversedNum = reversedNum * 10 + (num % 10);
            num /= 10;
        }
        return reversedNum;