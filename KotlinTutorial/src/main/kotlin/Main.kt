// This is how you define a class in Kotlin
class Person(var name: String, var age: Int) {
    // This is a function (also called a method) inside the class
    fun greet() {
        println("Hello, my name is $name and I am $age years old.")
        // When called, this will output: Hello, my name is [name] and I am [age] years old.
    }
}

// This is how you define a data class in Kotlin
// Data classes are used to hold data. They automatically generate equals(), hashCode(), toString(), copy() and componentN() functions
data class Pet(var name: String, var type: String)

// This is the main function, where the program starts
fun main() {
    // Here we're creating a variable and assigning it an instance of the Person class
    // This is also a demonstration of constructor usage in Kotlin
    val person1 = Person("Kelton", 22)

    // This is how you call a method on an object
    person1.greet()
    // Output: Hello, my name is Kelton and I am 25 years old.

    // This is an example of a mutable list in Kotlin
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    // This is a for loop, which iterates over the items in the list
    for (num in numbers) {
        // This is an example of variable interpolation in a string
        println("The number is $num")
        // Output: The number is [num], where [num] is each number in the list
    }

    // Let's create another person
    val person2 = Person("Makayla", 21)

    // And let's add them to a list of Persons
    val people = listOf(person1, person2)

    // We can also loop over this list, calling the greet function on each person
    for (person in people) {
        person.greet()
        // Output: Hello, my name is [name] and I am [age] years old., where [name] and [age] are the details of each person in the list
    }

    // Now let's create a pet using our data class
    val pet = Pet("Max", "Dog")

    // And print out the details of the pet
    println("The pet's name is ${pet.name} and it is a ${pet.type}.")
    // Output: The pet's name is Max and it is a Dog.
}
