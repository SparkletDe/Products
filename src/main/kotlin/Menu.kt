package Dz1.OOP4_addProduct


class Menu {
    var list = arrayListOf<Product>()

    fun start() {

        while (true) {
            println("0 выйти ")
            println("1 добавить продукт в корзину")
            println("2 список всех продуктов ")
            println("3 список продуктов дороже 100")
            println("4 очистить список")
            println("5 использовать готовый список продуктов")
            println("6 удалить продукт по названию")


            var product11 = readln()
            when (product11) {
                "1" -> {
                    addProduct()

                }

                "2" -> {
                    listMenuOfProd()

                }

                "3" -> {
                    hightPrice()

                }

                "4" -> {
                    cleanList()

                }

                "5" -> {
                    createGroup()

                }

                "0" -> {
                    break
                }
                "6" -> {
                    (deleteProduct())

                }
            }

        }
    }


    fun addProduct() {
        println("введите продукт")
        var name1 = readln()
        println("Введите цену $name1")
        var price1 = readln().toInt()
        var newProduct = Product(name1, price1)
        list.add(newProduct)
    }

    fun createGroup() {

        var pr1 = Product("Tomato", 10)
        var pr2 = Product("Potato", 20)
        var pr3 = Product("Orange", 110)
        list.add(pr1)
        list.add(pr2)
        list.add(pr3)
    }

    fun cleanList() {
        if (list.isEmpty()) {
            println("Корзина была пуста")
        } else {
            list.clear()
            println("Корзина очищена")
        }
    }

    fun listMenuOfProd() {

        for (product in list) {
            println("Название продукта ${product.name} Цена продукта ${product.price} ")

        }
    }

    fun hightPrice() {
        println("продкуты дороже 100")
        for (product: Product in list) {
            if (product.price <= 100) {
                println("Название ${product.name} цена ${product.price}")
            }

        }
    }


    fun deleteProduct() {
        println("Введите имя удаляемого продукта")
        var deleteProd = readln()
        list.removeIf { e -> e.name == deleteProd }
    }
}


