package com.github.catvod.spider.merge.p016Q;

import com.github.catvod.spider.merge.p017R.InterfaceC0196d;
import com.github.catvod.spider.merge.p017R.InterfaceC0197e;

/* renamed from: com.github.catvod.spider.merge.Q.a */
/* loaded from: classes.dex */
public abstract class AbstractC0179a implements InterfaceC0196d {
    /* renamed from: E */
    public abstract boolean mo1192E(Object obj, Object obj2);

    /* renamed from: F */
    public abstract int mo1191F(Object obj);

    @Override // com.github.catvod.spider.merge.p017R.InterfaceC0196d
    /* renamed from: a */
    public void mo1184a() {
    }

    @Override // com.github.catvod.spider.merge.p017R.InterfaceC0196d
    /* renamed from: j */
    public void mo1183j() {
    }

    @Override // com.github.catvod.spider.merge.p017R.InterfaceC0196d
    /* renamed from: r */
    public Object mo1182r(InterfaceC0197e interfaceC0197e) {
        int mo1189d = interfaceC0197e.mo1189d();
        Object obj = null;
        for (int i = 0; i < mo1189d; i++) {
            obj = interfaceC0197e.mo1190c(i).mo476a(this);
        }
        return obj;
    }
}
