# -*- coding: utf-8 -*-

def drawHourGlass(h):
    def main():
        for i in range(1, h+1):
            print draw(i, h)
        for i in range(h, 0, -1):
            print draw(i, h)[-1::-1]
           
    def writeChar(res, char, num):
        for i in range(num):
            res += char
        return res
    
    def draw(n, h):        
        res = ''
        if n == 1:
            res += "+"
            res = writeChar(res, '-', h*2-2)
            res += '+'
            return res
        if h >= n > 1:
            res += '|'
            res = writeChar(res, ' ', n-2)
            res += "\\"
            res = writeChar(res, '.', (h-n)*2)
            res += "/"
            res = writeChar(res, ' ', n-2)
            res += '|'
            return res
    main()


drawHourGlass(1)
print
drawHourGlass(2)
print
drawHourGlass(3)
print
drawHourGlass(4)
print


#  极简版   Python小技巧太多了

def drawHourGlassSimple(h):
    def main():
        for i in range(1, h+1):
            print draw(i, h)
        for i in range(h, 0, -1):
            print draw(i, h)[-1::-1]
    
    def draw(n, h):        
        if n == 1:
            return "+" + '-'*(h*2-2) + "+"
        if h >= n > 1:
            return ('|' + ' '*(n-2) + "\\"
                    + '.'*((h-n)*2) + "/" 
                    + ' '*(n-2) + '|')
    main()



