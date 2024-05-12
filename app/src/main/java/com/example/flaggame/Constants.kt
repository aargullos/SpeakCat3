package com.example.flaggame

object Constants {
    fun getQuestion() : ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "Selecciona lo referente a la imagen",
            R.drawable.agua,
            "aigua",
            "te",
            "llet",
            "cafè",
            1)

        val que2 = Question(2,
            "Selecciona lo referente a la imagen",
            R.drawable.bocadillo,
            "te",
            "cafè",
            "entrepà",
            "galeta",
            3)

        val que3 = Question(3,
            "Selecciona lo referente a la imagen",
            R.drawable.pescado,
            "carn",
            "peix",
            "entrepà",
            "galeta",
            2)

        val que4 = Question(4,
            "Selecciona lo referente a la imagen",
            R.drawable.entrepa,
            "Galleta",
            "Gracias",
            "Bocadillo",
            "Gasiosa",
            3)

        val que5 = Question(5,
            "Selecciona lo referente a la imagen",
            R.drawable.pregunta5,
            "un té con leche",
            "un té con azucar",
            "por favor",
            "un café con azúcar",
            1)

        val que6 = Question(6,
            "Selecciona lo referente a la imagen",
            R.drawable.galleta,
            "Aigua",
            "Entrepà",
            "Galeta",
            "Briox",
            3)

        val que7 = Question(7,
            "Selecciona lo referente a la imagen",
            R.drawable.con,
            "cafè",
            "amb",
            "per",
            "com",
            2)

        val que8 = Question(8,
            "Selecciona lo referente a la imagen",
            R.drawable.pregunta8,
            "un té con un boacadillo",
            "un té con leche",
            "un té por favor",
            "un té con una galleta",
            4)

        val que9 = Question(9,
            "Selecciona lo referente a la imagen ",
            R.drawable.pregunta9,
            "amb, llet, aigua, entrepà, cafè",
            "cafè, aigua, entrepà, llet, amb",
            "llet, cafè, aigua, amb, entrepà",
            "llet, cafè, aigua, entrepà, amb",
            3)

        val que10 = Question(10,
            "Selecciona lo referente a la imagen",
            R.drawable.carn,
            "Carn",
            "Peix",
            "Entrepà",
            "Cargol",
            1)

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)

        return questionsList
    }

}