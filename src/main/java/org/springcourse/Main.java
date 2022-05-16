package org.springcourse;

import org.apache.logging.log4j.core.Logger;
import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class Main{
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args)throws IOException,SQLException{
        log.debug("Hello this is a debug message");
        log.debug("Hello this is an info message");
    }
}