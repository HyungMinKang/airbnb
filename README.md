# 에어비앤비 클론  

<div align="center">
    
[![Android](https://img.shields.io/badge/android%20studio-2021.1.1%20Patch%202-%233DDC84?logo=android-studio)]() [![Kotlin](https://img.shields.io/badge/kotlin-1.5.30-%237F52FF?logo=kotlin)]()
    
[![DI](https://img.shields.io/badge/DI-Koin-%2358C8AE)]() [![Pattern](https://img.shields.io/badge/Pattern-MVVM-%2358C8AE)]()
[![](https://img.shields.io/badge/Library-jetpack--navigation-brightgreen)]() [![Google Maps](https://img.shields.io/badge/Library-coroutine-brightgreen)]() [![Retrofit](https://img.shields.io/badge/Library-Retrofit-%23%234285F4)]() [![Glide](https://img.shields.io/badge/Library-Glide-brightgreen)]() 
[![TMap](https://img.shields.io/badge/Library-Tmap-brightgreen)]() [![ViewPager2](https://img.shields.io/badge/Library-Viewpager2-brightgreen)]() 
[![StfalconPriceRangeBar](https://img.shields.io/badge/Library-StfalconPriceRangeBar-brightgreen)]() 
[![JetpackCompose](https://img.shields.io/badge/Library-JetpackComposerbrightgreen)]() 
</div>
 
<br>

## 🖥 주요 화면

![res2-min](https://user-images.githubusercontent.com/58967292/173248788-d0448987-7796-4463-9fc1-b9f98a4defcb.gif)

<br>

## 🌟 화면 별 기능

### 로그인화면

- OAuth2를 활용한 GitHub 로그인

### 홈 화면
- 상단 검색바
- 히어로 이미지
- 사용자 현재 위치에 따른 주요 도시 거리 정보
- 추천 여행지 리스트

### 검색 화면
- 검색어 없을시 추천 여행지 리스트 보여줌
- 검색어 클릭시 정보 입력 화면 이동

### 정보 입력 화면
- ### 달력화면
  - 달력뷰를 통해 체크인, 체크아웃 날짜 선택
  - 입력값 없을시 넘어가기 , 있을시 지우기 기능

- ### 가격 범위
  - 숙소를 검색할 최소, 최대 가격 범위 선택
  - 입력값 없을시 넘어가기 , 있을시 지우기 기능 

- ### 인원수
  - 숙소에 머물 인원수 입력
  - 입력값 없을시 넘어가기 , 있을시 지우기 기능 
 
### 검색 결과화면
- 검색 조건이 불완전할 경우 -> 태그(도시이름)을 통해서 검색
- 검색 조건이 모두 입력되었을 경우-> 검색 조건을 통해서 검색
- 지도버튼을 통해 검색결과를 지도로 보여주기 기능
- 무한 스크롤을 통해 페이징 처리 

### 검색 디테일 화면
- ViewPager2를 이용한 이미지 스와이프 처리
- 검색 조건이 불완전할 경우 -> 정보입력하기 버튼 활성화
- 검색 조건이 모두 입력되었을 경우-> 에약하기 버튼 활성화

### 위시리스트 화면
- 로그인한 계정에 등록된 위시리스트를 보여줌

### 예약리스트 화면
- 로그인한 계정에 등록된 예약리스트를 보여줌
<br>



## 🤼‍♂️ 팀원 🤼‍♀️

[Android]
|[Linus(라이너스](https://github.com/cherrylime69)|[강형민](https://github.com/HyungMinKang)
|:----:|:----:|  
|<img src="https://avatars.githubusercontent.com/u/95393311?v=4" width="100">|<img src="https://avatars.githubusercontent.com/u/58967292?v=4" width="100">|

[Backend]
|[Hwi](https://github.com/hwicode)|[Jun](https://github.com/devjun10)
|:----:|:----:|  
|<img src="https://avatars.githubusercontent.com/u/95541996?v=4" width="100">|<img src="https://avatars.githubusercontent.com/u/92818747?v=4" width="100">|


<br>

## ✨ 기술 스택

-  의존성 주입 구현 
-  서버 API 연동 후 네트워크 응답구조 설계
-  화면 이동 구조 설계
-  커스텀 달력 구현 
-  Xml + Jetpack Compose 혼합하는 형태의 UI 구현 
-  로그인 기능 구현
-  화면간 데이터 공유 설계
-  커스텀 마커 구현 
-  가격 선택 범위 그래프 구현 
-  지도뷰 구현
-  무한 스크롤 구현 
-  숙소의 주소 정보를 위치정보로 변환해 지도에 마커 형태로 표현 
-  협업
  -  브랜치 전략 수립,  깃헙 이슈를 통해 작업 분할  


<br>

## 💡 핵심 키워드

1️⃣ 커스텀 달력 
  
2️⃣ 무한 스크롤

3️⃣ 지도 API,  커스텀 마커

4️⃣ OAuth 로그인



<br>

## 📂 Project Folder
```
📂airbnb
  ├─common
  ├─data
  │  ├─dto
  │  ├─remote
  │  └─repository
  |  └─tmap 
  ├─di
  ├─domain
  |  ├─city
  |  ├─model
  │  ├─tmap
  │  └─repository.kt
  └─ui
     ├─comon
     ├─calendar
     ├─accommodationDetail
     ├─guestRange
     ├─home
     ├─information
     ├─login
     ├─mapSearch
     ├─priceRange
     ├─reseravtion
     ├─ reseravationInformation
     ├─searchResult
     └─wish
```

## 🔗 관련 링크
<details>
<summary>📑 ERD 설계</summary>
<div markdown="1">

<img width="1240" alt="스크린샷 2022-05-25 오후 2 28 25" src="https://user-images.githubusercontent.com/95541996/170209916-6df18330-fb13-4d06-976c-78d260d58ff6.png">

</div>
</details>

- [위키](https://github.com/hwicode/airbnb/wiki)

- [Anroid 칸반보드](https://github.com/hwicode/airbnb/projects/1)

<br>
