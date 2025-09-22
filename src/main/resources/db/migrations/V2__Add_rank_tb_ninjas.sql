-- Migrations to add rank column to ninjas table

ALTER TABLE tb_ninjas
ADD COLUMN rank VARCHAR(255);