package com.example.profile

object DataUser {
    private val userImages = intArrayOf(
        R.drawable.raka,
        R.drawable.luthfi,
        R.drawable.opik,
        R.drawable.raka,
        R.drawable.luthfi,
        R.drawable.opik,
        R.drawable.raka,
        R.drawable.luthfi,
        R.drawable.opik,
        R.drawable.raka
    )

    private val userName = arrayOf(
        "Raka",
        "Luthfi",
        "Opick",
        "Alvin",
        "Gamma",
        "Rafi",
        "Indrajati",
        "Micky",
        "Velly",
        "Novan"
    )

    private val userBirth = arrayOf(
        "26 Februari 1998",
        "25 Januari 1997",
        "16 Mei 1998",
        "20 Juni 2020",
        "26 Februari 1998",
        "25 Januari 1997",
        "16 Mei 1998",
        "20 Juni 2020",
        "31 Desember 1997",
        "1 Januari 1998"
    )

    private val userPlace = arrayOf(
        "Jakarta",
        "Bandung",
        "Bekasi",
        "Medan",
        "Tasikmalaya",
        "Makassar",
        "Banda Aceh",
        "Sorong",
        "Semarang",
        "Yogyakarta"
    )

    val listData: ArrayList<User>
    get() {
        val list = arrayListOf<User>()
        for (position in userName.indices) {
            val user = User()
            user.name = userName[position]
            user.photo = userImages[position]
            user.birth = userBirth[position]
            user.place = userPlace[position]
            list.add(user)
        }
        return list
    }
}