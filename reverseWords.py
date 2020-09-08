'''
Given a long sentence, reverse each word of the sentence individually in the sentence itself.
Examples:

Input : Geeks For Geeks is good to learn
Output : skeeG roF skeeG si doog ot nrael

Input : Split Reverse Join
Output : tilpS esreveR nioJ

'''


#AUTHOR : SANTOSH D KOLUR


def reverseWords():
  print(' '.join([ele[::-1] for ele in input().split(' ')]))
  
if __name__ == '__main__':
  reverseWords()
