package org.stella.eval;

import org.syntax.stella.Absyn.*;

public class TypeCheck
{
    public static void typecheckProgram(Program program) throws Exception
    {
        AProgram aProgram = (AProgram) program;
        Visitor visitor = new Visitor(aProgram);
    }
}
