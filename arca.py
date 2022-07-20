
from curses import wrapper
import requests
from bs4 import BeautifulSoup
import random
import re
import os

address = input("주소입력")
inurl =('%s' % address)
url = inurl
response = requests.get(url)
lotto= [] # 추첨 

if response.status_code == 200:
    html = response.text
    soup = BeautifulSoup(html, 'html.parser')
    title = soup.select("div > div.info-row.clearfix > span > a")
    
    for title1 in title:
        ## Tag안의 텍스트
        
        list1 = title1.text
        if list1 == "ㅇㅇ":
            van = title1.get('data-filter')
            lotto.append(van)
        else :
            lotto.append(list1)
        
        
    ## Tag의 속성을 가져오기(ex: href속성)

else : 
    print(response.status_code)
    
    
for r in range(1,5) :
    url2 = ('%s&cp=%d#comment' % (address, r))
    response = requests.get(url2)
    if response.status_code == 200:
        html = response.text
        soup = BeautifulSoup(html, 'html.parser')
        title = soup.select("div > div.info-row.clearfix > span > a")
        
        for title1 in title:
            ## Tag안의 텍스트
            
            list1 = title1.text
            if list1 == "ㅇㅇ":
                van = title1.get('data-filter')
                lotto.append(van)
            else :
                lotto.append(list1)
            
            
        ## Tag의 속성을 가져오기(ex: href속성)


  

gay = set(lotto) #집합set으로 변환
gay2 = list(gay)


for j in range(len(gay2)):
    print(gay2[j], end='\n')

print("주작결과")

print(random.choice(lotto))
