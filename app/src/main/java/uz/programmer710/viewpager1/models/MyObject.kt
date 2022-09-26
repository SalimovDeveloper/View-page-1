package uz.programmer710.viewpager1.models

import uz.programmer710.viewpager1.R

object MyObject {
    val nameTxtList = ArrayList<MyInfo>()

    fun loadTxt(){
        nameTxtList.add(
            MyInfo(
            "Xush kelibsiz",
            "Kim korubdur, ey ko'ngil ahli jahindun yaxshilig. \n" +
                    "Kimkim, andin yaxshi  yo'q, ko'z tutma ardin yaxshligi.",
            R.drawable.fon1
        )
        )
        nameTxtList.add(
            MyInfo(
                "Hikoyalar dunyosi",
                "Gar zamonni nayf qilsam ayb qilma, ey rafiq,\n" +
                        " Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘ !",
                R.drawable.fon2
            )
        )
        nameTxtList.add(
            MyInfo(
                "Kitob ortidan",
                "Dilrabolardin yomonliq keldi mahzun ko‘ngluma,\n " +
                        "Kelmadi jonimg'a hech oromi jondin yaxshilig'.",
                R.drawable.fon3
            )
        )
        nameTxtList.add(
            MyInfo(
                "Bizga qo'shiling",
                "Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p, \n" +
                        "Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?",
                R.drawable.fon4
            )
        )
    }
}