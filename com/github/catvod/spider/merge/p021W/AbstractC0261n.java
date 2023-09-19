package com.github.catvod.spider.merge.p021W;

import com.github.catvod.spider.merge.atm;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.W.n */
/* loaded from: classes.dex */
abstract class AbstractC0261n extends AbstractC0262o {

    /* renamed from: a */
    Pattern f459a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0261n() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p021W.AbstractC0262o
    /* renamed from: a */
    public final boolean mo1090a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p021W.AbstractC0262o
    /* renamed from: b */
    public final boolean mo1089b(C0267t c0267t, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        Matcher matcher = this.f459a.matcher(str.substring(parsePosition.getIndex()));
        if (!matcher.lookingAt()) {
            parsePosition.setErrorIndex(parsePosition.getIndex());
            return false;
        }
        parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
        mo1087c(calendar, matcher.group(1));
        return true;
    }

    /* renamed from: c */
    abstract void mo1087c(Calendar calendar, String str);

    public String toString() {
        return getClass().getSimpleName() + atm.m897d("4A210A14382C0F081448") + this.f459a + atm.m897d("37");
    }
}
