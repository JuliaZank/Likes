fun main() {
    var likes : String = "61";

    if (likes[(likes.length)-1] == '1' && likes[(likes.length)-2] == '1') {
        println("Понравилось $likes людям")
    } else if (likes[(likes.length)-1] == '1') {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}