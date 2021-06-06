package kr.co.everex.mvvmarchitecture.dataclass

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

/**
    Observable은 실시간으로 데이터를 관찰하기 위해 사용된다.
    기본적으로 ObservableField를 이용하는데,
    기본적으로 안드로이드에서 제공해주는 단일 필드가 있는 독립적인 식별 가능한 개체다.

    Android Developer에 있는 예시를 보자.
    사람의 성인 firstName과 이름인 lastName,
    그리고 나이인 age를 변수로 가지고 있는 User객체가 있다고 할 때
    ObservalbeField를 이용해서 실시간으로 관찰 가능한 데이터로 만들게 되면 다음과 같이 작성할 수 있다.
 */
class User {
    /**
     * ObservalbeField는 박싱 및 언박싱을 방지하기 때문에 val로 설정해주어야 한다.
     * 필드 값을 저장(set)하거나 불러오려면(get) 우리가 알고 있는 방식대로 저장하고 불러오면 된다.
     */
    val firstName = ObservableField<String>()
    val lastName = ObservableField<String>()
    val age = ObservableInt()
}