package scala.tools.nsc.tasty

import TastyRefs.NameRef

trait TastyNameTable { self: TastyUniverse =>
  val nameAtRef: NameRef => symbolTable.TermName
  val signedNameAtRef: NameRef => Either[SignedName[symbolTable.TermName, symbolTable.TypeName], symbolTable.TermName]
}
