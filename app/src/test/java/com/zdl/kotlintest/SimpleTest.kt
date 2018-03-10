package com.zdl.kotlintest

import org.junit.Test

/**
 * Created by 89667 on 2017/11/30.
 */
class SimpleTest {


    @Test
    fun Aa() {
//        System.out.println("aaaa")

        val pa: String = ""//不允许null
        val paa: String? = null//如果是null,打印的就是null也可以打印lenth
        val pc: String? = "wwww"//String!!表示很确定是不为空
        println(pc!!.length)
//        println(paa?.length)


    }

    /**
     * 数组测试
     * kotlin为八种数据类型都设置了包装数组
     */
    @Test
    fun arr() {
        val intarray: IntArray = intArrayOf(1, 23, 555)//int型数组
//        println(intarray.toString())
        val stringarray: Array<String> = arrayOf("w", "s", "ssss")
        val perarray: Array<Person> = arrayOf(Person("aaaa"), Person("adsasdsad"))

        val booarr: BooleanArray = booleanArrayOf(true, false, true, false)

//        val str:String = "赞赏"//字符串对比用==
//        if (str == "赞赏") {
//            print("存在")
//        } else {
//            print("不存在")
//        }

//        val inta:Int = 105
//        when (inta) {
//            in 1..100 -> print("$inta is in 1..100")
//            else-> print("其他")
//        }
        /**
         * for 循环
         */
//        val arrayOfInt:IntArray = intArrayOf(1,2,3,5,6)
//        for (aa in arrayOfInt) {//aa为变量,要赋值的对象
//                print("$aa,")
//        }

        val arrayOfChar: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o')
//        arrayOfChar.forEach { print(it) }//forEach  将数组整合
        for ((index, value) in arrayOfChar.withIndex()) {
//            print("$index-$value")//带下标
            if (index == 2) {
                break

            }
            print("$value")

        }
    }

}