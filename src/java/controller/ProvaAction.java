/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author User
 */
public class ProvaAction extends org.apache.struts.actions.MappingDispatchAction {
    
    public ActionForward successo(ActionMapping mapping,
                             ActionForm form,
                             HttpServletRequest request, 
                             HttpServletResponse response
                             ) throws IOException, ServletException {
        
        return mapping.findForward("ok");
    }
    
    public ActionForward fallimento(ActionMapping mapping,
                             ActionForm form,
                             HttpServletRequest request, 
                             HttpServletResponse response
                             ) throws IOException, ServletException {
        
        return mapping.findForward("fail");
    }
    
    
}
