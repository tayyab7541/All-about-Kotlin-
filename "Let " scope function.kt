fun main() {

    var text: String?=null

    text="malik"
    
    text?.let {       //this check if text is null it does nothing and if text is not null it will run println inside let block
        
        println(text)

    }
}
