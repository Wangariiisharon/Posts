package dev.mwangi.myposts

open class Item(){

}
class post(
    var userId:Int,
    var id:Int,
    var title:String,
    var body:String
):Item()
class comment(
    var postId:Int,
    var id:Int,
    var name:String,
    var email:String,
    var body:String
):Item()
//fun <T> compareIds(item1:T ,item2:T):T{
// var output=(item1.toString() + item2.toString())
//    println(output)
//    return item1
//}
//fun stage(){
//    var post1=post(1,2,"abc","efg")
//    var post2=post(1,2,"abc","efg")
//    compareIds(post1,post2)
//
//    var comment1=comment(1,2,"abc","efg"," ")
//    var comment2=comment(1,2,"abc","efg"," ")
//    compareIds(comment1,comment2)
//
//}