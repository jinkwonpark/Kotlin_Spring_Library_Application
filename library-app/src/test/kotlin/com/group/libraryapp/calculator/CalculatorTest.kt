package com.group.libraryapp.calculator

import com.group.libraryapp.calculator.Calculator
import java.lang.IllegalArgumentException

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideTest()
    calculatorTest.divideExceptionTest()
}

class CalculatorTest {

    fun addTest() {
        // given : 테스트 대상을 만들어 준비하는 과정
        val calculator = Calculator(5)

        // when : 실제 우리가 테스트 하고 싶은 기능을 호출하는 과정
        calculator.add(3)

        // then : 호출 이후 의도한 결과가 나왔는지 확인하는 과정
        if (calculator.number != 8) {
            throw IllegalArgumentException()
        }
    }

    fun minusTest() {
        // given : 테스트 대상을 만들어 준비하는 과정
        val calculator = Calculator(5)

        // when : 실제 우리가 테스트 하고 싶은 기능을 호출하는 과정
        calculator.minus(3)

        // then : 호출 이후 의도한 결과가 나왔는지 확인하는 과정
        if (calculator.number != 2) {
            throw IllegalArgumentException()
        }
    }

    fun multiplyTest() {
        // given : 테스트 대상을 만들어 준비하는 과정
        val calculator = Calculator(5)

        // when : 실제 우리가 테스트 하고 싶은 기능을 호출하는 과정
        calculator.multiply(3)

        // then : 호출 이후 의도한 결과가 나왔는지 확인하는 과정
        if (calculator.number != 15) {
            throw IllegalArgumentException()
        }
    }

    fun divideTest() {
        // given : 테스트 대상을 만들어 준비하는 과정
        val calculator = Calculator(5)

        // when : 실제 우리가 테스트 하고 싶은 기능을 호출하는 과정
        calculator.divide(2)

        // then : 호출 이후 의도한 결과가 나왔는지 확인하는 과정
        if (calculator.number != 2) {
            throw IllegalArgumentException()
        }
    }

    fun divideExceptionTest() {
        // given : 테스트 대상을 만들어 준비하는 과정
        val calculator = Calculator(5)

        // when : 실제 우리가 테스트 하고 싶은 기능을 호출하는 과정
        try {
            calculator.divide(0)
        } catch (e: IllegalArgumentException) {
            if (e.message != "0으로 나눌 수 없습니다.") {
                throw IllegalStateException("메시지가 다릅니다.")
            }
            // 테스트 성공!!
            return
        } catch (e: Exception) {
            throw IllegalStateException()
        }
        throw IllegalStateException("기대하는 예외가 발생하지 않았습니다.")
    }
}