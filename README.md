# ExRecyclerView
RecyclerView Example for EOS

설명 그대로 RecyclerView 예제입니다.
메인 화면에서 Linear, Grid Type 을 선택해서 볼 수 있습니다.


## Branch
브랜치는 총 세개입니다.
 - master: 기본 브랜치입니다. 가장 기본적인 구현방식이며, 덕분에 findViewById 가 많이 등장합니다.
 - databinding: **DataBinding** 을 적용한 브랜치입니다. master 에서 뻗어나오도록 처리해뒀으니 어떤 부분들이 수정되었는지도 보시면 도움이 될 것 같아요! 일부러 커밋도 쪼개려고 노력했으니...
 - mvvm: MVVM 은 ***Model, View, ViewModel*** 로 이루어진 아키텍쳐 패턴입니다. DataBinding 이 MVVM 과 궁합이 좋아 하는 김에 추가해본 브랜치입니다. 사실 MVVM을 포함한 아키텍쳐 패턴은 안드로이드 (혹은 다른 어떤 것이든) ***코딩에 익숙해진 후에***  학습하는 것을 추천합니다!

 
## Dependencies
 - **com.android.support:recyclerview-v7:27.1.1** : RecyclerView 를 이용하기 위한 Library 입니다.
 - **com.android.support:design:27.1.1** : Snackbar 이하동문
 - **[de.hdodenhof:circleimageview:2.2.0](https://github.com/hdodenhof/CircleImageView)** : CircleImageView 이하동문
 - **[com.github.bumptech.glide:glide:4.8.0](https://github.com/bumptech/glide)** : Image Loading & Caching Library 입니다. 이후 URL 을 통한 이미지 로딩에도 많이 쓰일 거예요.
