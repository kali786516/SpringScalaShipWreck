package SpringScala.controllers

import javax.servlet.http.{HttpServlet, HttpServletRequest}
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{PathVariable, RequestMapping, RequestMethod, RequestParam}
import SpringScala.model.Account
import org.springframework.web.bind.annotation.RequestMethod.POST
import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.beans.factory.annotation.Value

@Controller
class HomeController {

  @RequestMapping(value = Array("/home","/"))
  def index() = {
    "return blah"
  }


  /*
  @RequestMapping(value = Array("/home","/"))
  def index(@RequestParam(value = "userName",required = false,defaultValue = "Guest") userName:String,model:Model) = {
    model.addAttribute("userName",userName)
    "index"
    //http://localhost:8080/home?userName=kali
  }
  */

  /*

  @RequestMapping(value = Array("/home/{category:[a-z]+}/{userName}"))
  def dynamicUrl(@PathVariable("userName") userName:String, model:Model) = {
    model.addAttribute("userName",userName)
    "index"
    //http://localhost:8080/home?userName=kali
  }

  @RequestMapping(Array("/home/newAccount"))
  def newAccount(model: Model) = {
    model.addAttribute("account",new Account())
    "newAccount"
  }

  @RequestMapping(Array("/home/showAccount"))
  def showAccount() = {
    "showAccount"
  }


  @RequestMapping(value = Array("/home/saveAccount"),method = Array(RequestMethod.POST))
  def saveAccount(model: Model,request:HttpServletRequest,@RequestParam("accountNo") acno1:Int)={

    //val acNo             = request.getParameter("accountNo").toInt
    val customerName     = request.getParameter("accountHolderName")
    val customerBalance  = request.getParameter("balance").toInt
    val accountType      = request.getParameter("accountType")
    val dateofBirth      = request.getParameter("dateofBirth")

    val accountObj       =  Account(acno1,customerName,customerBalance,accountType,dateofBirth)

    model.addAttribute("acNo",accountObj.accountNo)
    model.addAttribute("customerName",accountObj.accountHolderName)
    model.addAttribute("customerBalance",accountObj.balance)
    model.addAttribute("accountType",accountObj.accountType)
    model.addAttribute("dateofBirth",accountObj.dateOfBirth)

    "showAccount"
  }

   */

  /*
  Never Worked
  @RequestMapping(value = Array("/saveAccount"),method = Array(RequestMethod.POST))
  def saveAccount(model: Model,account:Account)={
    model.addAttribute("accountObj",account)
    "showAccount"
  }*/


}
