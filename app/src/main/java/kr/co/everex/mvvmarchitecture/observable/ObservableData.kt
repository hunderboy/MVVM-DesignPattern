package kr.co.everex.mvvmarchitecture.observable

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

/**
    Observable 인터페이스를 구현하는 클래스를 사용할 대 식별 가능한 개체의 속성 변경에 관해 알림을 받으려는 리스너를 등록할 수 있다.
    간단하게 말하자면 getter와 setter를 등록할 수 있다는 것이다.
    BaseObservable이라는 클래스를 이용하여 간단하게 구현할 수 있다. 실습한 내용을 보면서 사용법을 알아보자.
 */
class ObservableData : BaseObservable(){

    /**
    ObservableData 라는 이름을 가진 데이터 클래스를 하나 만들어 주었다.
    여기에는 사이트의 이름이 들어갈 site변수를 하나 만들어 주었고, 이 변수를 실시간으로 관찰이 가능한 데이터로 만들어 주었다.
    위에서 Observable 인터페스를 구현하는 클래스는 getter와 setter를 등록할 수 있다고 했다.

    코틀린은 자바와는 다른 방식으로 구현할 수 있는데,
    @get:Bindable을 이용해 getter에 할당하고
    setter의 notifyPropertyChanged() 메서드를 호출함으로 작업을 완료한다.
    처음에 BR이라는 부분이 정의되지 않아서 BR.site가 빨간줄이 뜰 수도 있는데 Build를 하거나 실행을 하면 정상적으로 돌아오기 때문에 너무 신경쓰지 않아도 된다.
     */
    @get:Bindable
    var site : String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.site)
        }



}