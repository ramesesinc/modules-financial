package com.rameses.enterprise.financial.models;

import com.rameses.osiris2.common.*;
import com.rameses.rcp.common.*;
import com.rameses.rcp.annotations.*;
import com.rameses.osiris2.client.*;
import com.rameses.seti2.models.*;

class AccountSubListModel extends CrudSubListModel {

    def getCustomFilter() {
        return [ "maingroupid = :mid", [mid: masterEntity.objid] ];
    }

}