class infixtopostfix:
  def __init__(self):
    self.stack=[]
    self.rev=[]
    self.result=[]

  def push(self,x):
    self.rev.append(x)
  def priority(self,i):
    p1=['+','-']
    p2=['*','/']
    p3=['^']
    if i in p1:
      return 1
    elif i in p2:
      return 2
    elif i in p3:
      return 3
    else:
      return 0
    
  
  def convertExp(self):
    tempstack=[]
    for x in self.rev:
      if x=='(':
         tempstack.append(x)
      elif x.isalpha() or x.isdigit():
        self.result.append(x)
      elif x==')':
        c=tempstack.pop()
        while c!='(' and len(tempstack)!=0:
          self.result.append(c)
          if len(tempstack)!=0:
            c=tempstack.pop()
          

      else:
        p=self.priority(x)
        if len(tempstack)!=0:
          q=self.priority(tempstack[-1])
          if q==0:
            tempstack.append(x)
          elif p>q:
            tempstack.append(x)
          elif p==q and x==tempstack[-1]:
            tempstack.append(x)

          else:
            k=tempstack.pop()
            while(p<=q and k!='('):
             
              self.result.append(k)
              
              if len(tempstack)!=0:
                r=tempstack[-1]
                q=self.priority(r)
              
                if q!=0:
                  k=tempstack.pop()
              else:
                break
              
              
            tempstack.append(x)
        else:
          tempstack.append(x)
    while len(tempstack)!=0:
      self.result.append(tempstack.pop())
 
  def display(self):
    str=""
    for x in range(len(self.result)):
      str+=self.result[x]
    print(str)
   
s=input()
inpre=infixtopostfix()
for x in s:
  inpre.push(x)
inpre.convertExp()
inpre.display()
