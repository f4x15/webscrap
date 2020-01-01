import akka.actor.{Actor, ActorRef, ActorSystem, Props}

class HelloActor extends Actor {
  override def receive = {
    case "Hello" => println("world!")
  }
}

object Main extends App {
  val system: ActorSystem = ActorSystem("System")
  val helloWorld: ActorRef = system.actorOf(Props[HelloActor], "HelloActor")

  helloWorld ! "Hello"
}
