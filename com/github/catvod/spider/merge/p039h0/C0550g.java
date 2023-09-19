package com.github.catvod.spider.merge.p039h0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p035f0.C0524e;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0522c;
import com.github.catvod.spider.merge.p043j0.C0584e;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.h0.g */
/* loaded from: classes.dex */
public final class C0550g implements InterfaceC0522c {
    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    /* renamed from: a */
    public final C0525f mo322a(C0524e c0524e, List<C0525f> list) {
        LinkedList linkedList = (LinkedList) list;
        if (linkedList.size() == 1) {
            return new C0525f(Boolean.valueOf(!((C0525f) linkedList.get(0)).m451a().booleanValue()));
        }
        throw new C0584e(atm.m897d("0F08081A3E781A1B0814217803145A1B232C4218151A20714A1C0F1B2F2C0315145B1C340F1B09106C3B021F191E62"));
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    public final String name() {
        return atm.m897d("04150E");
    }
}
