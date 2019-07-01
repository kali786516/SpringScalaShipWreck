package SpringScala.model

import javax.validation.constraints.NotNull


case class Account(
                   @NotNull var accountNo:Int = 0,
                   @NotNull var accountHolderName:String = "",
                   @NotNull var balance:Int = 0,
                   @NotNull var accountType:String = "",
                   @NotNull var dateOfBirth:String="20190921",
                   @NotNull var psCode:String=""
                  )


