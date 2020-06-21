package com.rameses.enterprise.financial.models;

import com.rameses.rcp.annotations.*;
import com.rameses.rcp.common.*;
import com.rameses.osiris2.client.*;
import com.rameses.osiris2.common.*;
import com.rameses.seti2.models.CrudListModel;

class FundListModel extends CrudListModel {

    public void initColumn( c ) { 
        if ( c.name == 'code') {
            c.width = 120; 
            c.maxWidth = 180; 
        }
        else if ( c.name == 'state' ) { 
            c.width = 100; 
            c.maxWidth = 120; 
        }
    } 
}    