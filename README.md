# Kotlin CodeLab

요구사항 : LiveData, Observing, NavGraph, ViewModel, Hilt, ListAdapter, Coroutine, Safe Args 사용 (MVVM Design Pattern 이용)  

**1.** 하단 네비게이션 바를 통해서 routing  
  A. navGraph 버전은 "2.4.0-alpha01" 이상으로, 안드로이드에서 제공해주는 기본적인 fragment 재활용을 사용하자.  
  B. 갈 페이지는,  
    i. 숫자 1부터 10까지 변화하면서 txtView로 보여주는 페이지 + 다시 1부터 10까지(LiveData , Observing, viewModel ,repo, Hilt 사용)  
      1. 버튼 눌러서 증가  
      2. 화면 회전에도 데이터 보존 돼야함  
    ii. Recycler view를 이용한 커뮤니티(viewModel , ListAdapter를 사용해서 구현)  
	    참고 : https://blog.naver.com/crazem/222755202559   
		(일단 보류)서비스(Service)로 txtView에 있는 값을 Service의 결과로 바꾸고, broadcast Message도 화면에서 보여주는 페이지  
    iii. 코루틴 + suspend fun 을 사용해서 숫자를 순서대로 보여주는 페이지 , (viewModel , LiveData 사용)  
    Ex) 1 10번, 2 10번, 3 10번, 4 무한. 1,4는 Coroutine으로, 2,3은 suspend 함수로 프린트. Delay 금지 + 4번은 버튼으로 코루틴을 cancel 할 수 있어야 함.  
	참고 : https://blog.naver.com/crazem/222738984114   
**2.** 라우팅시, 이전 페이지 넘버를 safe Args로 넘겨서 ToastMessage로 보여줄 것임.  
**3.** 전체적인 구조는 안드로이드 개발의 표준인 MVVM 패턴으로 작성  

✔️ Check List  

-  Bottom Navigation 완료, navGraph 버전 2.4.0-alpha01 완료, FragmentConatinerView 사용