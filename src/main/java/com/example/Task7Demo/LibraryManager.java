package com.example.Task7Demo;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class LibraryManager {
    ArrayList<LibraryMember> members = new ArrayList<>();

    public void initializeMembers(){
        members.add(new LibraryMember("101", "Ahmed", "Gold"));
        members.add(new LibraryMember("102", "Fatma", "Silver"));
        members.add(new LibraryMember("103", "Salim", "Gold"));
    }

    public void addMember(LibraryMember member){
        members.addLast(member);
    }

    public void displayMembers(){
        for(LibraryMember m : members){
            System.out.println(m.toString());
        }
    }

    public String deleteMemberById(String memberId){
        Boolean found = false;
        for(LibraryMember m : members){
            if(m.getMemberId() == memberId){
                members.remove(m);
                found = true;
                break;
            }
        }
        return found ? "Member deleted successfully!" : "Member Not Found!!";

    }


}
