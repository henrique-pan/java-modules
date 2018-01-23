module appfuncs {
	exports appfuncs.simplefuncs;
}

/*
	javac -d appmodules/appfuncs appsrc/appfuncs/appfuncs/simplefuncs/SimpleMathFuncs.java

	javac -d appmodules/appfuncs appsrc/appfuncs/module-info.java

	OR

	javac -d appmodules/appfuncs appsrc/appfuncs/appfuncs/simplefuncs/SimpleMathFuncs.java appsrc/appfuncs/module-info.java

	javac --module-path appmodules -d appmodules/appstart appsrc/appstart/module-info.java appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java

	java --module-path appmodules -m appstart/appstart.mymodappdemo.MyModAppDemo
*/