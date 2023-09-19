package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p025a0.AbstractC0299s;
import java.util.Locale;

/* renamed from: com.github.catvod.spider.merge.c0.O */
/* loaded from: classes.dex */
public final class C0441O {
    /* renamed from: a */
    public static String m624a(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* renamed from: b */
    public static String m623b(String str) {
        return m624a(str).trim();
    }

    /* renamed from: c */
    public static void m622c(InterfaceC0442P interfaceC0442P, AbstractC0299s abstractC0299s) {
        C0277c.m1063l(abstractC0299s);
        AbstractC0299s abstractC0299s2 = abstractC0299s;
        int i = 0;
        while (abstractC0299s2 != null) {
            AbstractC0299s m936A = abstractC0299s2.m936A();
            int mo903h = m936A != null ? m936A.mo903h() : 0;
            AbstractC0299s m913s = abstractC0299s2.m913s();
            interfaceC0442P.mo314b(abstractC0299s2, i);
            if (m936A != null && !abstractC0299s2.m915q()) {
                if (mo903h == m936A.mo903h()) {
                    abstractC0299s2 = m936A.m922g(abstractC0299s2.m929H());
                } else if (m913s == null) {
                    i--;
                    abstractC0299s2 = m936A;
                } else {
                    abstractC0299s2 = m913s;
                }
            }
            if (abstractC0299s2.mo903h() > 0) {
                abstractC0299s2 = abstractC0299s2.m922g(0);
                i++;
            } else {
                while (abstractC0299s2.m913s() == null && i > 0) {
                    interfaceC0442P.mo315a(abstractC0299s2, i);
                    abstractC0299s2 = abstractC0299s2.m936A();
                    i--;
                }
                interfaceC0442P.mo315a(abstractC0299s2, i);
                if (abstractC0299s2 == abstractC0299s) {
                    return;
                }
                abstractC0299s2 = abstractC0299s2.m913s();
            }
        }
    }
}
