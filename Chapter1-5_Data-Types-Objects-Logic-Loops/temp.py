def revertSequenceModified():
    numList = []
    dic = {}
    x = input('Please enter a positive whole number or enter "0" to stop: ')
    while x != 0:
        if x not in dic:
            dic[x] = 1
        if x in dic:
            dic[x] += 1
        numList.insert(0,x)
        x = input('Please enter a positive whole number or enter "0" to stop: ')
    if len(numList) == 0:
        print 'No number entered besides 0'
    else:
        print 'Sequence in reverse order: ', numList
        print 'minimum: ', min(numList)
        print 'maximum: ', max(numList)
        print 'average: ', float(sum(numList))/len(numList)
        print 'Most occurred number(s): ', [key for dic[key]==max(dic.values())]
