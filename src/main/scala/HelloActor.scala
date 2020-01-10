import akka.actor.{Actor, ActorRef, ActorSystem, Props}

// companion objects for correct interfaces/pattern matching
object HelloWorld {
  case class Hello()
  case class World()
}

class HelloActor extends Actor {
  override def receive = {
    case "Hello" => println("world!")
  }
}

object Main extends App {
  val system: ActorSystem = ActorSystem("System")
  val helloWorld: ActorRef = system.actorOf(Props[HelloActor], "HelloActor")

  helloWorld ! "Hello"

  system.stop(helloWorld)
  system.terminate()
}
