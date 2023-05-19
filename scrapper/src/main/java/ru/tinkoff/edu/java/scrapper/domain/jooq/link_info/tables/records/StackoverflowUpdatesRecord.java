/*
 * This file is generated by jOOQ.
 */

package ru.tinkoff.edu.java.scrapper.domain.jooq.link_info.tables.records;

import java.beans.ConstructorProperties;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import ru.tinkoff.edu.java.scrapper.domain.jooq.link_info.tables.StackoverflowUpdates;

/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class StackoverflowUpdatesRecord extends UpdatableRecordImpl<StackoverflowUpdatesRecord>
    implements Record3<Long, Boolean, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>LINK_INFO.STACKOVERFLOW_UPDATES.ID</code>.
     */
    public void setId(@NotNull Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>LINK_INFO.STACKOVERFLOW_UPDATES.ID</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>LINK_INFO.STACKOVERFLOW_UPDATES.IS_ANSWERED</code>.
     */
    public void setIsAnswered(@Nullable Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>LINK_INFO.STACKOVERFLOW_UPDATES.IS_ANSWERED</code>.
     */
    @Nullable
    public Boolean getIsAnswered() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>LINK_INFO.STACKOVERFLOW_UPDATES.ANSWER_COUNT</code>.
     */
    public void setAnswerCount(@Nullable Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>LINK_INFO.STACKOVERFLOW_UPDATES.ANSWER_COUNT</code>.
     */
    @Nullable
    public Integer getAnswerCount() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<Long, Boolean, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row3<Long, Boolean, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return StackoverflowUpdates.STACKOVERFLOW_UPDATES.ID;
    }

    @Override
    @NotNull
    public Field<Boolean> field2() {
        return StackoverflowUpdates.STACKOVERFLOW_UPDATES.IS_ANSWERED;
    }

    @Override
    @NotNull
    public Field<Integer> field3() {
        return StackoverflowUpdates.STACKOVERFLOW_UPDATES.ANSWER_COUNT;
    }

    @Override
    @NotNull
    public Long component1() {
        return getId();
    }

    @Override
    @Nullable
    public Boolean component2() {
        return getIsAnswered();
    }

    @Override
    @Nullable
    public Integer component3() {
        return getAnswerCount();
    }

    @Override
    @NotNull
    public Long value1() {
        return getId();
    }

    @Override
    @Nullable
    public Boolean value2() {
        return getIsAnswered();
    }

    @Override
    @Nullable
    public Integer value3() {
        return getAnswerCount();
    }

    @Override
    @NotNull
    public StackoverflowUpdatesRecord value1(@NotNull Long value) {
        setId(value);
        return this;
    }

    @Override
    @NotNull
    public StackoverflowUpdatesRecord value2(@Nullable Boolean value) {
        setIsAnswered(value);
        return this;
    }

    @Override
    @NotNull
    public StackoverflowUpdatesRecord value3(@Nullable Integer value) {
        setAnswerCount(value);
        return this;
    }

    @Override
    @NotNull
    public StackoverflowUpdatesRecord values(@NotNull Long value1, @Nullable Boolean value2, @Nullable Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StackoverflowUpdatesRecord
     */
    public StackoverflowUpdatesRecord() {
        super(StackoverflowUpdates.STACKOVERFLOW_UPDATES);
    }

    /**
     * Create a detached, initialised StackoverflowUpdatesRecord
     */
    @ConstructorProperties({"id", "isAnswered", "answerCount"})
    public StackoverflowUpdatesRecord(@NotNull Long id, @Nullable Boolean isAnswered, @Nullable Integer answerCount) {
        super(StackoverflowUpdates.STACKOVERFLOW_UPDATES);

        setId(id);
        setIsAnswered(isAnswered);
        setAnswerCount(answerCount);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised StackoverflowUpdatesRecord
     */
    public StackoverflowUpdatesRecord(ru.tinkoff.edu.java.scrapper.domain.jooq.link_info.tables.pojos.StackoverflowUpdates value) {
        super(StackoverflowUpdates.STACKOVERFLOW_UPDATES);

        if (value != null) {
            setId(value.getId());
            setIsAnswered(value.getIsAnswered());
            setAnswerCount(value.getAnswerCount());
            resetChangedOnNotNull();
        }
    }
}