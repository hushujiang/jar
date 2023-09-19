package com.github.catvod.spider.merge.p041i0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p035f0.C0524e;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0523d;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.github.catvod.spider.merge.i0.a */
/* loaded from: classes.dex */
public final class C0566a implements InterfaceC0523d {
    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0523d
    /* renamed from: a */
    public final C0525f mo313a(C0524e c0524e) {
        LinkedList linkedList = new LinkedList();
        Iterator<C0293m> it = c0524e.m462a().iterator();
        while (it.hasNext()) {
            C0293m next = it.next();
            linkedList.add(atm.m897d("1919081C3C2C").equals(next.mo900t()) ? next.m985X() : next.m960w0());
        }
        return new C0525f(linkedList);
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0523d
    public final String name() {
        return atm.m897d("0B16162129201E");
    }
}
