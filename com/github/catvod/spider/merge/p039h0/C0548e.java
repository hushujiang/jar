package com.github.catvod.spider.merge.p039h0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p021W.C0250c;
import com.github.catvod.spider.merge.p035f0.C0524e;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0522c;
import com.github.catvod.spider.merge.p043j0.C0584e;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.github.catvod.spider.merge.h0.e */
/* loaded from: classes.dex */
public final class C0548e implements InterfaceC0522c {
    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    /* renamed from: a */
    public final C0525f mo322a(C0524e c0524e, List<C0525f> list) {
        LinkedList linkedList = (LinkedList) list;
        String m445g = ((C0525f) linkedList.get(0)).m445g();
        String m445g2 = ((C0525f) linkedList.get(1)).m445g();
        try {
            if (linkedList.size() > 2 && linkedList.get(2) != null) {
                return new C0525f(new SimpleDateFormat(m445g2, Locale.forLanguageTag(((C0525f) linkedList.get(2)).m445g())).parse(m445g));
            }
            return new C0525f(C0250c.m1096b(m445g2).m1095c(m445g));
        } catch (ParseException e) {
            throw new C0584e(e);
        }
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    public final String name() {
        return atm.m897d("0C1508182D2C471E1B0129");
    }
}
