#Flatten List

def flatten(l):
    for i in l:
        if isinstance(i,list):
            flatten(i)
        else:
            flattenList.append(i)
    return flattenList
  
  #Reverse List
  
  def reverseList(l):
    l.reverse()
    for i in range(len(l)):
      l[i]=(l[i])[::-1]
    return l
  
