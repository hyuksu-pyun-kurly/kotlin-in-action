package ch06.ex1_8_1_LateinitializedProperties


class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private var myService: MyService? = null

    fun setUp() {
        myService = MyService()
    }
}
