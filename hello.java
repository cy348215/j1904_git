 public Object memberSave(String uname,String upwd,HttpServletRequest request){
        User u=new User();
      
        User b=userService.findUser(u);
        request.getSession().setAttribute("currentUser",b);
        return "member";

    }
