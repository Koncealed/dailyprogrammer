def changeWord(word1, word2) :
    list1 = [letter for letter in word1]
    list2 = [letter for letter in word2]
    print(word1)
    for i in range(0,len(list1)) :
        if list1[i] is not list2[i] :
            list1[i] = list2[i]
            print(''.join(list1))



changeWord("floor","break")
print()
print()
changeWord("wood","book")
print()
print()
changeWord("a fall to the floor","braking the door in")
