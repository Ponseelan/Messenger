package com.chatApplication.Messenger.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class ActionResult {
    private String Action;
    private Date date;
    private String EntityName;
    private String EntityNaturalId;

    public ActionResult() {
    }

    private ActionResult(String entityName, String entityNaturalId,String Action) {
        this.Action=Action;
        EntityName = entityName;
        EntityNaturalId = entityNaturalId;
        date=new Date();
    }

    public static ActionResult create(String entityName, String entityNaturalId,String Action)
    {
        return new ActionResult(entityName,entityNaturalId,Action);
    }
}
