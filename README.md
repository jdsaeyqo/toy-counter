# 프로젝트 소개
- 토이 프로젝트
- 제목 : toy-counter
- 구분 : 개인 프로젝트
- 개발환경 - 안드로이드 스튜디오
- 사용 언어 - Kotlin
- 내용 
 증가, 감소 버튼 누를 시 중앙에 숫자 증가, 감소  
 다음 버튼 누르면 두 번째 프래그먼트로 이동
 
 메인|증가|프래그먼트 이동
 :------:|:------:|:------:
 ![image1](https://github.com/jdsaeyqo/toy-counter/blob/master/app/src/main/res/drawable/toy_1.jpg)|![image2](https://github.com/jdsaeyqo/toy-counter/blob/master/app/src/main/res/drawable/toy_2.jpg)| ![image3](https://github.com/jdsaeyqo/toy-counter/blob/master/app/src/main/res/drawable/toy_3.jpg)
 
 
 - 카운트 숫자는 LiveData 구현
 - ViewModel 사용하여 UI와 로직 분리
 - DataBinding
 - 처음 0에서 시작하고 증가버튼을 누르면 숫자 증가, 감소 버튼을 누르면 숫자 감소
 - 다음 버튼 누를시 Navigation Action 으로 다음 프래그먼트로 이동
 - 첫번째 프래그먼트에서 다음 프래그먼트로 데이터 전달
 - 두번째 프래그먼트에서 증가 감소 똑같이 기능
