package com.beranju.tokomakanan.model.dummy

data class HomeModel(
    var title: String,
    var src: String,
    var rating: Float,
    var price: String? = null,
    )

val foodListDummy = listOf(
    HomeModel("Rendang Komplit dan Jus", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn0-production-images-kly.akamaized.net%2F6ZZIvGifaE6sGCMf7L4wxHuT2Vg%3D%2F1200x900%2Fsmart%2Ffilters%3Aquality(75)%3Astrip_icc()%3Aformat(jpeg)%2Fkly-media-production%2Fmedias%2F1253731%2Foriginal%2F213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg&imgrefurl=https%3A%2F%2Fwww.liputan6.com%2Fhot%2Fread%2F4343886%2F5-resep-masakan-rendang-daging-sapi-menggugah-selera&tbnid=UyQki83AEjipVM&vet=12ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ..i&docid=yABymIyeD6Q4oM&w=1200&h=900&q=img%20rendang&client=firefox-b-d&ved=2ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ", 5f),
    HomeModel("Nasi Goreng & Ayam geprek", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn0-production-images-kly.akamaized.net%2F6ZZIvGifaE6sGCMf7L4wxHuT2Vg%3D%2F1200x900%2Fsmart%2Ffilters%3Aquality(75)%3Astrip_icc()%3Aformat(jpeg)%2Fkly-media-production%2Fmedias%2F1253731%2Foriginal%2F213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg&imgrefurl=https%3A%2F%2Fwww.liputan6.com%2Fhot%2Fread%2F4343886%2F5-resep-masakan-rendang-daging-sapi-menggugah-selera&tbnid=UyQki83AEjipVM&vet=12ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ..i&docid=yABymIyeD6Q4oM&w=1200&h=900&q=img%20rendang&client=firefox-b-d&ved=2ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ", 4f),
    HomeModel("Ayam Geprek + Mandi", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn0-production-images-kly.akamaized.net%2F6ZZIvGifaE6sGCMf7L4wxHuT2Vg%3D%2F1200x900%2Fsmart%2Ffilters%3Aquality(75)%3Astrip_icc()%3Aformat(jpeg)%2Fkly-media-production%2Fmedias%2F1253731%2Foriginal%2F213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg&imgrefurl=https%3A%2F%2Fwww.liputan6.com%2Fhot%2Fread%2F4343886%2F5-resep-masakan-rendang-daging-sapi-menggugah-selera&tbnid=UyQki83AEjipVM&vet=12ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ..i&docid=yABymIyeD6Q4oM&w=1200&h=900&q=img%20rendang&client=firefox-b-d&ved=2ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ", 5f),
    HomeModel("Nasi Padang", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn0-production-images-kly.akamaized.net%2F6ZZIvGifaE6sGCMf7L4wxHuT2Vg%3D%2F1200x900%2Fsmart%2Ffilters%3Aquality(75)%3Astrip_icc()%3Aformat(jpeg)%2Fkly-media-production%2Fmedias%2F1253731%2Foriginal%2F213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg&imgrefurl=https%3A%2F%2Fwww.liputan6.com%2Fhot%2Fread%2F4343886%2F5-resep-masakan-rendang-daging-sapi-menggugah-selera&tbnid=UyQki83AEjipVM&vet=12ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ..i&docid=yABymIyeD6Q4oM&w=1200&h=900&q=img%20rendang&client=firefox-b-d&ved=2ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ", 4.8f),
    HomeModel("Bubur Kacang Ijo", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn0-production-images-kly.akamaized.net%2F6ZZIvGifaE6sGCMf7L4wxHuT2Vg%3D%2F1200x900%2Fsmart%2Ffilters%3Aquality(75)%3Astrip_icc()%3Aformat(jpeg)%2Fkly-media-production%2Fmedias%2F1253731%2Foriginal%2F213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg&imgrefurl=https%3A%2F%2Fwww.liputan6.com%2Fhot%2Fread%2F4343886%2F5-resep-masakan-rendang-daging-sapi-menggugah-selera&tbnid=UyQki83AEjipVM&vet=12ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ..i&docid=yABymIyeD6Q4oM&w=1200&h=900&q=img%20rendang&client=firefox-b-d&ved=2ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ", 4.5f),
    HomeModel("Kripik Ubi", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn0-production-images-kly.akamaized.net%2F6ZZIvGifaE6sGCMf7L4wxHuT2Vg%3D%2F1200x900%2Fsmart%2Ffilters%3Aquality(75)%3Astrip_icc()%3Aformat(jpeg)%2Fkly-media-production%2Fmedias%2F1253731%2Foriginal%2F213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg&imgrefurl=https%3A%2F%2Fwww.liputan6.com%2Fhot%2Fread%2F4343886%2F5-resep-masakan-rendang-daging-sapi-menggugah-selera&tbnid=UyQki83AEjipVM&vet=12ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ..i&docid=yABymIyeD6Q4oM&w=1200&h=900&q=img%20rendang&client=firefox-b-d&ved=2ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ", 5f),
)

val foodListDummyVertical = listOf(
    HomeModel("REndang", "", 5f, "5000"),
    HomeModel("Nasi Goreng & Ayam geprek", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn0-production-images-kly.akamaized.net%2F6ZZIvGifaE6sGCMf7L4wxHuT2Vg%3D%2F1200x900%2Fsmart%2Ffilters%3Aquality(75)%3Astrip_icc()%3Aformat(jpeg)%2Fkly-media-production%2Fmedias%2F1253731%2Foriginal%2F213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg&imgrefurl=https%3A%2F%2Fwww.liputan6.com%2Fhot%2Fread%2F4343886%2F5-resep-masakan-rendang-daging-sapi-menggugah-selera&tbnid=UyQki83AEjipVM&vet=12ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ..i&docid=yABymIyeD6Q4oM&w=1200&h=900&q=img%20rendang&client=firefox-b-d&ved=2ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ", 4f, "8000"),
    HomeModel("Ayam Geprek + Mandi", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn0-production-images-kly.akamaized.net%2F6ZZIvGifaE6sGCMf7L4wxHuT2Vg%3D%2F1200x900%2Fsmart%2Ffilters%3Aquality(75)%3Astrip_icc()%3Aformat(jpeg)%2Fkly-media-production%2Fmedias%2F1253731%2Foriginal%2F213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg&imgrefurl=https%3A%2F%2Fwww.liputan6.com%2Fhot%2Fread%2F4343886%2F5-resep-masakan-rendang-daging-sapi-menggugah-selera&tbnid=UyQki83AEjipVM&vet=12ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ..i&docid=yABymIyeD6Q4oM&w=1200&h=900&q=img%20rendang&client=firefox-b-d&ved=2ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ", 5f, "7999"),
    HomeModel("Nasi Padang", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn0-production-images-kly.akamaized.net%2F6ZZIvGifaE6sGCMf7L4wxHuT2Vg%3D%2F1200x900%2Fsmart%2Ffilters%3Aquality(75)%3Astrip_icc()%3Aformat(jpeg)%2Fkly-media-production%2Fmedias%2F1253731%2Foriginal%2F213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg&imgrefurl=https%3A%2F%2Fwww.liputan6.com%2Fhot%2Fread%2F4343886%2F5-resep-masakan-rendang-daging-sapi-menggugah-selera&tbnid=UyQki83AEjipVM&vet=12ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ..i&docid=yABymIyeD6Q4oM&w=1200&h=900&q=img%20rendang&client=firefox-b-d&ved=2ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ", 4.8f, "20000"),
    HomeModel("Bubur Kacang Ijo", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn0-production-images-kly.akamaized.net%2F6ZZIvGifaE6sGCMf7L4wxHuT2Vg%3D%2F1200x900%2Fsmart%2Ffilters%3Aquality(75)%3Astrip_icc()%3Aformat(jpeg)%2Fkly-media-production%2Fmedias%2F1253731%2Foriginal%2F213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg&imgrefurl=https%3A%2F%2Fwww.liputan6.com%2Fhot%2Fread%2F4343886%2F5-resep-masakan-rendang-daging-sapi-menggugah-selera&tbnid=UyQki83AEjipVM&vet=12ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ..i&docid=yABymIyeD6Q4oM&w=1200&h=900&q=img%20rendang&client=firefox-b-d&ved=2ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ", 4.5f, "70000"),
    HomeModel("Kripik Ubi", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn0-production-images-kly.akamaized.net%2F6ZZIvGifaE6sGCMf7L4wxHuT2Vg%3D%2F1200x900%2Fsmart%2Ffilters%3Aquality(75)%3Astrip_icc()%3Aformat(jpeg)%2Fkly-media-production%2Fmedias%2F1253731%2Foriginal%2F213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg&imgrefurl=https%3A%2F%2Fwww.liputan6.com%2Fhot%2Fread%2F4343886%2F5-resep-masakan-rendang-daging-sapi-menggugah-selera&tbnid=UyQki83AEjipVM&vet=12ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ..i&docid=yABymIyeD6Q4oM&w=1200&h=900&q=img%20rendang&client=firefox-b-d&ved=2ahUKEwjoksfIsfT8AhWileYKHVXLAe8QMygCegUIARC9AQ", 5f, "5000"),
)