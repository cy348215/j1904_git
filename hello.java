 public Object memberSave(String uname,String upwd,HttpServletRequest request){
        User u=new User();
        u.setUname(uname);
        u.setUpwd(upwd);
        User b=userService.findUser(u);
        request.getSession().setAttribute("currentUser",b);
        return "member";

    }
