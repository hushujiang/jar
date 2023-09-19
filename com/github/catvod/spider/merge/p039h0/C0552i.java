package com.github.catvod.spider.merge.p039h0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p035f0.C0524e;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0522c;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.h0.i */
/* loaded from: classes.dex */
public final class C0552i implements InterfaceC0522c {
    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    /* renamed from: a */
    public final C0525f mo322a(C0524e c0524e, List<C0525f> list) {
        LinkedList linkedList = (LinkedList) list;
        return new C0525f(Boolean.valueOf(((C0525f) linkedList.get(0)).m445g().startsWith(((C0525f) linkedList.get(1)).m445g())));
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    public final String name() {
        return atm.m897d("190E1B07382B470D130124");
    }
}
